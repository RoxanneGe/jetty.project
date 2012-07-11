// ========================================================================
// Copyright 2011-2012 Mort Bay Consulting Pty. Ltd.
// ------------------------------------------------------------------------
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// and Apache License v2.0 which accompanies this distribution.
//
//     The Eclipse Public License is available at
//     http://www.eclipse.org/legal/epl-v10.html
//
//     The Apache License v2.0 is available at
//     http://www.opensource.org/licenses/apache2.0.php
//
// You may elect to redistribute this code under either of these licenses.
//========================================================================
package org.eclipse.jetty.websocket.server;

import java.util.List;

import org.eclipse.jetty.websocket.protocol.ExtensionConfig;

public interface WebSocketRequest
{
    // TODO: getSession
    // TODO: getCookies
    // TODO: getRequestAttributes ?

    public List<ExtensionConfig> getExtensions();

    public String getHeader(String name);

    public String getHost();

    public String getHttpEndPointName();

    public String getOrigin();

    public List<String> getSubProtocols();

    public boolean hasSubProtocol(String test);

    public boolean isOrigin(String test);
}
