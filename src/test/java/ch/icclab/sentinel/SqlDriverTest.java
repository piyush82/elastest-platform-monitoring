package ch.icclab.sentinel;/*
 * Copyright (c) 2017. Cyclops-Labs Gmbh
 *  All Rights Reserved.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License"); you may
 *     not use this file except in compliance with the License. You may obtain
 *     a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *     WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *     License for the specific language governing permissions and limitations
 *     under the License.
 */

import org.junit.Test;
import org.springframework.util.Assert;

import static org.junit.Assert.assertEquals;

/*
 *     Author: Piyush Harsh,
 *     URL: piyush-harsh.info
 */
public class SqlDriverTest
{
    public void setUp()
    {
        Initialize.prepareDbInitScripts();
        Initialize.initializeTestDb();
    }

    @Test
    public void testgetDBConnection()
    {
        Assert.notNull(SqlDriver.getDBConnection(), "Dbconnection object");
    }

    @Test
    public void testgetDbTablesList()
    {
        setUp();
        assertEquals("list of tables", 4, SqlDriver.getDbTablesList().size());
    }

    @Test
    public void testgetUserSpaces()
    {
        setUp();
        assertEquals("list of spaces for test user", 1, SqlDriver.getUserSpaces(1).size());
    }

    @Test
    public void testgetSpaceSeries()
    {
        setUp();
        assertEquals("list of series for a space for test user", 1, SqlDriver.getSpaceSeries(1).size());
    }

    @Test
    public void testisDuplicateUser()
    {
        setUp();
        Assert.isTrue(SqlDriver.isDuplicateUser("testuser"), "testing for duplicate user");
    }

    @Test
    public void testisValidApikey()
    {
        setUp();
        Assert.isTrue(SqlDriver.isValidApikey("testuser", "7ddbba60-8667-11e7-bb31-be2e44b06b34"), "testing for api key validation");
        Assert.isTrue(SqlDriver.isValidApikey(1, "7ddbba60-8667-11e7-bb31-be2e44b06b34"), "testing for api key validation");
    }

    @Test
    public void testisValidPassword()
    {
        setUp();
        Assert.isTrue(SqlDriver.isValidPassword(1, "test"), "testing for password verification");
    }
}
