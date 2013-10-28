package org.scalaide.eclipsecon.javaplugin.handlers

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
class SampleHandler2 extends AbstractHandler {

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	override def execute(event: ExecutionEvent): Object = {
		val window = HandlerUtil.getActiveWorkbenchWindowChecked(event)
		MessageDialog.openInformation(
				window.getShell(),
				"Scala plugin",
				"Hello, Eclipse world")
		null
	}
}