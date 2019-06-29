/*
 * Copyright (c) 2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package sample

import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTests {
    @Test
    fun testHello() {
        assertTrue("Kotlin/Native" in hello())
    }
}