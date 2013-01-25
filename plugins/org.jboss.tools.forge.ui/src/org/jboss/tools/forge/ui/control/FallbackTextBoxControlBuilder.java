/*
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.tools.forge.ui.control;

import org.jboss.forge.ui.UIInput;

/**
 * This component only renders any undefined input as a textbox.
 * 
 * 
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 * 
 */
public class FallbackTextBoxControlBuilder extends TextBoxControlBuilder {
	@Override
	public boolean handles(UIInput<?> input) {
		return true;
	}
}
