/*
 * Copyright (c) 2017-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.litho.sections.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * A class annotated with {@link DiffSectionSpec} requires a method with this annotation. This
 * method is responsible for generating a <code>ChangeSet</code>.
 *
 * <pre>
 * {@literal @}OnDiff
 *  public static void onCreateChangeSet(
 *      SectionContext context,
 *      ChangeSet changeSet,
 *     {@literal @}Prop{@code Diff<Component>} component) {
 *    if (component.getNext() == null) {
 *      changeSet.delete(0);
 *    } else if (component.getPrevious() == null) {
 *      changeSet.insert(0, component.getNext());
 *    }
 *  }
 * </pre>
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface OnDiff {

}
