/*
 * Copyright (c) 2013 Kinvey Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.kinvey.xmpp_demo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import java.util.logging.Logger;

import com.kinvey.business_logic.KinveyAuthCredentials;

/**
 * @author mjsalinger
 * @since 2.0
 */
public class AppConfiguration implements ServletContextListener {
    private final static Logger LOGGER = Logger.getLogger(AppConfiguration.class.getName());

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        LOGGER.info("App is being configured.");
        KinveyAuthCredentials auth = KinveyAuthCredentials.getInstance();
        auth.setAppId("");
        auth.setMasterSecret("");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //To change body of implemented methods use File | Settings | File Templates.
    }


}

