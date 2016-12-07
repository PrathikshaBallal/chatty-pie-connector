package com.chattypie.web;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.chattypie.persistence.model.ChatroomCreationRecord;
import com.chattypie.service.chattypie.chatroom.ChatroomService;
import com.chattypie.service.chattypie.greeting.AsyncNotificationService;
import com.google.common.collect.Lists;

@RunWith(MockitoJUnitRunner.class)
public class ReportGenerationControllerTest {

	private ReportGenerationController testedController;
	private String testSubscriberEmail = "test@example.com";
	@Mock
	private ChatroomService mockChatroomService;
	@Mock
	private AsyncNotificationService mockNotificationService;

	@Before
	public void setUp() throws Exception {
		testedController = new ReportGenerationController(
			mockChatroomService,
			mockNotificationService,
			testSubscriberEmail
		);
	}

	@Test
	public void testGetChatroomReport_whenInvoked_thenWeGetInfoOnChatroomsCreatedLastWeekAndSendAReport() throws Exception {
		//Given
		List<ChatroomCreationRecord> expectedChatrooms = Lists.newArrayList();
		when(mockChatroomService.chatroomsCreatedLastWeek())
			.thenReturn(expectedChatrooms);

		//When
		testedController.getChatroomReport();

		//Then
		verify(mockNotificationService)
			.sendWeeklyChatroomCreatedReport(anyString(), eq(expectedChatrooms));

	}
}
