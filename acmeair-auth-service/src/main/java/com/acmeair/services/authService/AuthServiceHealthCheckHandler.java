/*******************************************************************************
* Copyright (c) 2013 IBM Corp.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*******************************************************************************/
package com.acmeair.services.authService;

import com.google.inject.Singleton;
import com.netflix.karyon.health.HealthCheckHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.PostConstruct;

@Singleton
public class AuthServiceHealthCheckHandler implements HealthCheckHandler {
	private static final Logger logger = LoggerFactory.getLogger(AuthServiceHealthCheckHandler.class);

	@PostConstruct
	public void init() {
		logger.info("Health check init");
	}

	@Override
	public int getStatus() {
		logger.info("Health check getStatus");
		return 200;
	}
}
