package com.chattypie.persistence.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCompanyAccount is a Querydsl query type for CompanyAccount
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCompanyAccount extends com.querydsl.sql.RelationalPathBase<CompanyAccount> {

    private static final long serialVersionUID = -612696976;

    public static final QCompanyAccount companyAccount = new QCompanyAccount("company_account");

    public final StringPath accountId = createString("accountId");

    public final StringPath id = createString("id");

    public final com.querydsl.sql.PrimaryKey<CompanyAccount> primary = createPrimaryKey(id);

    public QCompanyAccount(String variable) {
        super(CompanyAccount.class, forVariable(variable), "null", "company_account");
        addMetadata();
    }

    public QCompanyAccount(String variable, String schema, String table) {
        super(CompanyAccount.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCompanyAccount(String variable, String schema) {
        super(CompanyAccount.class, forVariable(variable), schema, "company_account");
        addMetadata();
    }

    public QCompanyAccount(Path<? extends CompanyAccount> path) {
        super(path.getType(), path.getMetadata(), "null", "company_account");
        addMetadata();
    }

    public QCompanyAccount(PathMetadata metadata) {
        super(CompanyAccount.class, metadata, "null", "company_account");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(accountId, ColumnMetadata.named("account_id").withIndex(2).ofType(Types.VARCHAR).withSize(255).notNull());
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.VARCHAR).withSize(255).notNull());
    }

}

