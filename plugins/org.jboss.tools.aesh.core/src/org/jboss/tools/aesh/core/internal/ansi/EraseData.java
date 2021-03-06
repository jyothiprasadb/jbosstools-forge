/**
 * Copyright (c) Red Hat, Inc., contributors and others 2013 - 2014. All rights reserved
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.tools.aesh.core.internal.ansi;

import org.jboss.tools.aesh.core.document.Document;


public class EraseData extends AbstractCommand {
	
	private String arguments;

	public EraseData(String arguments) {
		this.arguments = arguments;
	}

	@Override
	public CommandType getType() {
		return CommandType.ERASE_DATA;
	}
	
	@Override
	public void handle(Document document) {
    	if ("2".equals(arguments)) {
    		document.reset();
    	}		
	}

}
