/*-------------------------------------------------------------------------+
|                                                                          |
| Copyright 2005-2011 the ConQAT Project                                   |
|                                                                          |
| Licensed under the Apache License, Version 2.0 (the "License");          |
| you may not use this file except in compliance with the License.         |
| You may obtain a copy of the License at                                  |
|                                                                          |
|    http://www.apache.org/licenses/LICENSE-2.0                            |
|                                                                          |
| Unless required by applicable law or agreed to in writing, software      |
| distributed under the License is distributed on an "AS IS" BASIS,        |
| WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. |
| See the License for the specific language governing permissions and      |
| limitations under the License.                                           |
+-------------------------------------------------------------------------*/
package eu.cqse.check.sample;

import java.io.IOException;
import java.util.stream.Stream;

import org.conqat.lib.commons.test.ManagedTestData;
import org.conqat.lib.commons.test.ManagedTestDataExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.provider.Arguments;

import eu.cqse.check.framework.checktest.CheckTestBase;

/**
 * Main class for testing the checks in this library.
 */
@ExtendWith(ManagedTestDataExtension.class)
public class CheckTest extends CheckTestBase {

	public CheckTest(ManagedTestData managedTestData) {
		super(managedTestData);
	}

	@Override
	public Stream<Arguments> generateParameters() throws IOException {
		return CheckTestBase.generateParameters(new CheckTest(testData), SampleCheck.class);
	}
}