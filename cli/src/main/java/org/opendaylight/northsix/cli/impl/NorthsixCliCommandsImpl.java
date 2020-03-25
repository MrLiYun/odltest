/*
 * Copyright © 2017 Copyright (c) 2015 Yoyodyne, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.northsix.cli.impl;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.northsix.cli.api.NorthsixCliCommands;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NorthsixCliCommandsImpl implements NorthsixCliCommands {

    private static final Logger LOG = LoggerFactory.getLogger(NorthsixCliCommandsImpl.class);
    private final DataBroker dataBroker;

    public NorthsixCliCommandsImpl(final DataBroker db) {
        this.dataBroker = db;
        LOG.info("NorthsixCliCommandImpl initialized");
    }

    @Override
    public Object testCommand(Object testArgument) {
        return "This is a test implementation of test-command";
    }
}
