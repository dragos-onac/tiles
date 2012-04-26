/*
 * $Id$
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.tiles.web.startup;

import org.apache.tiles.startup.BasicTilesInitializer;
import org.apache.tiles.startup.TilesInitializer;

/**
 * Initialization Servlet.
 *
 * @see org.apache.tiles.web.startup.TilesListener
 * @version $Rev$ $Date$
 * @deprecated Please extend {@link AbstractTilesInitializerServlet}.
 */
public class TilesServlet extends AbstractTilesInitializerServlet {

    /**
     * Creates a new instance of {@link BasicTilesInitializer}. Override it to use a different initializer.
     *
     * @return The Tiles servlet-based initializer.
     * @since 2.1.2
     */
    protected TilesInitializer createTilesInitializer() {
        return new BasicTilesInitializer();
    }
}