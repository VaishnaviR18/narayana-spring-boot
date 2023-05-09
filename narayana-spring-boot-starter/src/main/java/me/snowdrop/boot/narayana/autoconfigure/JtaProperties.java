/*
 * Copyright 2020 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.snowdrop.boot.narayana.autoconfigure;

/*
 * Replacement class for org.springframework.boot.autoconfigure.transaction.jta.JtaProperties
 * which no longer exists in spring-boot 3.
 */
public class JtaProperties {

    private String logDirectory;
    private String transManagerId;

    public JtaProperties() {
    }

    public void setLogDir(String logDir) {
        this.logDirectory = logDir;
    }

    public String getLogDir() {
        return this.logDirectory;
    }

    public String getTransactionManagerId() {
        return this.transManagerId;
    }

    public void setTransactionManagerId(String transactionManagerId) {
        this.transManagerId = transactionManagerId;
    }

}
