package org.projectodd.nodyn.integration.javascript;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.vertx.testtools.ScriptClassRunner;
import org.vertx.testtools.TestVerticleInfo;

/*
 * Copyright 2013 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * @author Lance Ball
 */

@TestVerticleInfo(filenameFilter = "crypto_.+\\.js", funcRegex = "function[\\s]+(test[^\\s(]+)")
@RunWith(ScriptClassRunner.class)
public class CryptoIntegrationTests {
    @Test
    public void __vertxDummy() {
    }
}