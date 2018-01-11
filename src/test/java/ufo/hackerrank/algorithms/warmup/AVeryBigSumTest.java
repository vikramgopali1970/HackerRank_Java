/*******************************************************************************
 * Copyright 2018 Francesco Cina'
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package ufo.hackerrank.algorithms.warmup;

import static org.junit.Assert.*;

import org.junit.Test;

public class AVeryBigSumTest {

	@Test
	public void test() {
		assertEquals(5000000015l, AVeryBigSum.aVeryBigSum(0, new long[] {
				1000000001l,
				1000000002l,
				1000000003l,
				1000000004l,
				1000000005l
		}));
	}

}
