/******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package process.diagram.actions;


import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;

import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;


/**
 * @author sshaw
 *
 * Sample action for demonstrating invokation of a custom layout provider.  In this
 * case the square layout provider is invoked through a separate menu action.
 */
public class ExportModelAction	implements IWorkbenchWindowActionDelegate {

	/**
	 * Constructor
	 */
	public ExportModelAction() {
		//No-op
	}

	/**
	 * Walk the selected objects and creates a new diagram for each visited
	 * packages
	 * 
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	public void run(IAction action) {
		System.out.println("delete!");		
	}

	/**
	 * @see IWorkbenchWindowActionDelegate#selectionChanged
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		//No-op
	}

	/**
	 * @see IWorkbenchWindowActionDelegate#dispose
	 */
	public void dispose() {
		//No-op
	}

	/**
	 * @see IWorkbenchWindowActionDelegate#init
	 */
	public void init(IWorkbenchWindow windowIn) {
		//No-op
	}
}
