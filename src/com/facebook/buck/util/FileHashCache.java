/*
 * Copyright 2013-present Facebook, Inc.
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

import com.google.common.hash.HashCode;
import java.nio.file.Path;

/*
 * A cache which maps Paths to cached hashes of their contents,
 * based on a simplified subset of the java.util.Map<Path, HashCode> interface.
 */
public interface FileHashCache {
  boolean contains(Path path);

  HashCode get(Path path);

  void put(Path path, HashCode fileSha1);

}
