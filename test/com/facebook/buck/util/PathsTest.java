/*
 * Copyright 2012-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PathsTest {

  @Test
  public void testNormalizePathSeparator() {
    assertEquals("C:/Windows/System32/drivers.dll",
        Paths.normalizePathSeparator("C:\\Windows\\System32\\drivers.dll"));
  }

  @Test
  public void testContainsBackslash() {
    assertTrue(Paths.containsBackslash("C:\\Windows\\System32\\drivers.dll"));
    assertFalse(Paths.containsBackslash("C:/Windows"));
    assertFalse(Paths.containsBackslash("/usr/bin"));
  }
}
