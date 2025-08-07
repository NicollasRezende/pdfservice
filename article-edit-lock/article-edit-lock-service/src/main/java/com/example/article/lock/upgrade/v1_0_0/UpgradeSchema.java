package com.example.article.lock.upgrade.v1_0_0;

import com.liferay.portal.kernel.upgrade.UpgradeProcess;

public class UpgradeSchema extends UpgradeProcess {

    @Override
    protected void doUpgrade() throws Exception {
        // SQL para criar a tabela
        String createTableSQL = "create table Agencia_ArticleEditLock (" +
            "articleEditLockId LONG not null primary key," +
            "companyId LONG," +
            "groupId LONG," +
            "createDate DATE null," +
            "modifiedDate DATE null," +
            "articleId VARCHAR(75) null," +
            "userId LONG," +
            "userName VARCHAR(75) null," +
            "userFullName VARCHAR(75) null," +
            "locked BOOLEAN," +
            "lockTime DATE null" +
            ")";

        // Executa apenas se a tabela não existir
        if (!hasTable("Agencia_ArticleEditLock")) {
            runSQL(createTableSQL);
            
            // Cria os índices
            runSQL("create index IX_DF4C8557 on Agencia_ArticleEditLock (groupId)");
            runSQL("create unique index IX_1DF185D0 on Agencia_ArticleEditLock (locked, articleId)");
            runSQL("create index IX_4210BFD on Agencia_ArticleEditLock (locked, lockTime)");
            runSQL("create index IX_804F8EB on Agencia_ArticleEditLock (locked, userId)");
        }
    }
}