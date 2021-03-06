// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2016-2018 AppyBuilder.com, All Rights Reserved - Info@AppyBuilder.com
// https://www.gnu.org/licenses/gpl-3.0.en.html


package com.google.appinventor.client.editor.simple.components;

import com.google.appinventor.client.editor.simple.SimpleEditor;

/**
 * Mock TextBox component.
 *
 */
public final class MockLinedTextBox extends MockTextBoxBase {

  /**
   * Component type name.
   */
  public static final String TYPE = "LinedTextBox";

  /**
   * Creates a new MockTextBox component.
   *
   * @param editor  editor of source file the component belongs to
   */
  public MockLinedTextBox(SimpleEditor editor) {
    super(editor, TYPE, images.notepad());
  }
}
