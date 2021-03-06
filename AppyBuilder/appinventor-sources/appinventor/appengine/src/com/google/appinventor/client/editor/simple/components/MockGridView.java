// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2016-2018 AppyBuilder.com, All Rights Reserved - Info@AppyBuilder.com
// https://www.gnu.org/licenses/gpl-3.0.en.html

// Copyright 2009-2011 Google, All Rights reserved
// Copyright 2011-2012 MIT, All rights reserved
// Released under the Apache License, Version 2.0
// http://www.apache.org/licenses/LICENSE-2.0

package com.google.appinventor.client.editor.simple.components;

import com.google.appinventor.client.editor.simple.SimpleEditor;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.SimplePanel;

/**
 * Mock Slider component.
 *
 * @author M. Hossein Amerkashi - kkashi01@gmail.com
 */
public final class MockGridView extends MockVisibleComponent {
  private final Image largeImage = new Image(images.gridviewbig());

  /**
   * Component type name.
   */
  public static final String TYPE = "GridView";

  private static final int DEFAULT_WIDTH = 70;

  // Widget for showing the mock gridview
  private final SimplePanel widget;

  /**
   * Creates a new MockGridView component.
   *
   * @param editor editor of source file the component belongs to
   */
  public MockGridView(SimpleEditor editor) {
    super(editor, TYPE, images.gridview());

    // Initialize mock GridView UI
    widget = new SimplePanel();
    widget.setStylePrimaryName("ode-SimpleMockComponent");

    widget.setWidget(largeImage);

    initComponent(widget);
  }


  @Override
  protected boolean isPropertyVisible(String propertyName) {
    //We don't want to allow user to change height / width
    /*if (propertyName.equals(PROPERTY_NAME_HEIGHT) || propertyName.equals(PROPERTY_NAME_WIDTH)) {
      return false;
    }*/

    return super.isPropertyVisible(propertyName);
  }

  @Override
  public int getPreferredWidth() {
    // The superclass uses getOffsetWidth, which won't work for us.
    return DEFAULT_WIDTH;
  }

  // PropertyChangeListener implementation
  @Override
  public void onPropertyChange(String propertyName, String newValue) {
    super.onPropertyChange(propertyName, newValue);

  }
}
