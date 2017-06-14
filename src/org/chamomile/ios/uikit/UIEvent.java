package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSObject;

/*-[
#import <UIKit/UIKit.h>
 ]-*/

/**
 * An object that describes a single user interaction with your app.
 * 
 * @author ggeorg
 */
public final class UIEvent extends NSObject {

	public UIEvent(Object nativeObj) {
		setNativeObj(nativeObj);
	}

	// ---------------------------------------------------------------------
	// Getting the Touches for an Event.
	// ---------------------------------------------------------------------

	// ---------------------------------------------------------------------
	// Getting Event Attributes.
	// ---------------------------------------------------------------------

	//@formatter:off
	public native double getTimestamp() /*-[
		return [[self getNativeObj] timestamp];
	]-*/;
	//@formatter:on
	
	// ---------------------------------------------------------------------
	// Getting the Event Type.
	// ---------------------------------------------------------------------
	

	// ---------------------------------------------------------------------
	// Getting the Touches for a Gesture Recognizer.
	// ---------------------------------------------------------------------
	
}
