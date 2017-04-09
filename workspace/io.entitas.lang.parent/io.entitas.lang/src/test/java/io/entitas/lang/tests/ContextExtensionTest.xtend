/*
 * generated by Xtext 2.11.0
 */
package io.entitas.lang.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import io.entitas.lang.dsl.Root
import static extension io.entitas.lang.extensions.ContextExtensions.*

@RunWith(XtextRunner)
@InjectWith(DSLInjectorProvider)
class ContextExtensionTest {
	@Inject
	ParseHelper<Root> parseHelper
	
	@Test
	def void deafultContext() {
		val result = parseHelper.parse('''
			target T
			context A, B, C(default), D
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		
		Assert.assertEquals("C", result.context.defaultContextName)
	}
	
	@Test
	def void firstContextAsDefualt() {
		val result = parseHelper.parse('''
			target T
			context A, B, C, D
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		
		Assert.assertEquals("A", result.context.defaultContextName)
	}
}