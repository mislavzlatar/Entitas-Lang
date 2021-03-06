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
import static extension io.entitas.lang.generator.entitas_csharp.SystemGenerationExtension.*

@RunWith(XtextRunner)
@InjectWith(DSLInjectorProvider)
class SystemGenerationExtensionTest {
	@Inject
	ParseHelper<Root> parseHelper
	
	@Test
	def void simpleExecuteSystem() {
		val result = parseHelper.parse('''
			target A
			context Core, Input, Map
			sys Move
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		
		Assert.assertEquals('''
		public abstract class AbstractMoveSystem : IExecuteSystem{
		
			protected AbstractMoveSystem(Contexts contexts) {
			}
			public abstract void Execute();
		}
		'''.toString, 
		result.systems.get(0).abstractSystemClass("Core").toString 
		)
	}
	
	@Test
	def void simpleExecuteSystemWithParameters() {
		val result = parseHelper.parse('''
			target A
			context Core, Input, Map
			sys Foo (teardown, cleanup, init)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		
		Assert.assertEquals('''
		public abstract class AbstractFooSystem : IExecuteSystem, IInitializeSystem, ICleanupSystem, ITearDownSystem{
		
			protected AbstractFooSystem(Contexts contexts) {
			}
			public abstract void Execute();
			public abstract void Initialize();
			public abstract void Cleanup();
			public abstract void TearDown();
		}
		'''.toString, 
		result.systems.get(0).abstractSystemClass("Core").toString 
		)
	}
	
	@Test
	def void simpleExecuteSystemWithParametersNoExecute() {
		val result = parseHelper.parse('''
			target A
			context Core, Input, Map
			sys Foo (teardown, cleanup, init, no_exec)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		
		Assert.assertEquals('''
		public abstract class AbstractFooSystem : IInitializeSystem, ICleanupSystem, ITearDownSystem{
		
			protected AbstractFooSystem(Contexts contexts) {
			}
			public abstract void Initialize();
			public abstract void Cleanup();
			public abstract void TearDown();
		}
		'''.toString, 
		result.systems.get(0).abstractSystemClass("Core").toString 
		)
	}
	
	@Test
	def void reactiveSystemWithParameters() {
		val result = parseHelper.parse('''
			target A
			context Core, Input, Map
			comp Move in Input
			sys Foo (teardown, cleanup, init)
				trigger: added(Move)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		
		Assert.assertEquals('''
		public abstract class AbstractFooSystem : ReactiveSystem<InputEntity>, IInitializeSystem, ICleanupSystem, ITearDownSystem{
		
			protected AbstractFooSystem(Contexts contexts) : base(contexts.input) {
			}
			protected override Collector<InputEntity> GetTrigger(IContext<InputEntity> context) {
				return context.CreateCollector(InputMatcher.Move, GroupEvent.Added);
			}
			protected abstract override void Execute(System.Collections.Generic.List<InputEntity> entities);
			protected abstract override bool Filter(InputEntity entity);
			public abstract void Initialize();
			public abstract void Cleanup();
			public abstract void TearDown();
		}
		'''.toString, 
		result.systems.get(0).abstractSystemClass("Core").toString 
		)
	}
	
	@Test
	def void reactiveSystemWithNoFilter() {
		val result = parseHelper.parse('''
			target A
			context Core, Input, Map
			comp Move in Input
			sys Foo
				trigger: added(Move)
				noFilter
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		
		Assert.assertEquals('''
		public abstract class AbstractFooSystem : ReactiveSystem<InputEntity>{
		
			protected AbstractFooSystem(Contexts contexts) : base(contexts.input) {
			}
			protected override Collector<InputEntity> GetTrigger(IContext<InputEntity> context) {
				return context.CreateCollector(InputMatcher.Move, GroupEvent.Added);
			}
			protected override bool Filter(InputEntity entity) {
				return true;
			}
			protected abstract override void Execute(System.Collections.Generic.List<InputEntity> entities);
		}
		'''.toString, 
		result.systems.get(0).abstractSystemClass("Core").toString 
		)
	}
	
	@Test
	def void reactiveSystemWithFilterSimpleAllOf() {
		val result = parseHelper.parse('''
			target A
			context Core, Input, Map
			comp Move in Input
			sys Foo
				trigger: added(Move)
				filter allOf(Move)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		
		Assert.assertEquals('''
		public abstract class AbstractFooSystem : ReactiveSystem<InputEntity>{
		
			protected AbstractFooSystem(Contexts contexts) : base(contexts.input) {
			}
			protected override Collector<InputEntity> GetTrigger(IContext<InputEntity> context) {
				return context.CreateCollector(InputMatcher.Move, GroupEvent.Added);
			}
			readonly IMatcher<InputEntity> filterMatcher = InputMatcher.Move;
			protected override bool Filter(InputEntity entity) {
				return filterMatcher.Matches(entity);
			}
			protected abstract override void Execute(System.Collections.Generic.List<InputEntity> entities);
		}
		'''.toString, 
		result.systems.get(0).abstractSystemClass("Core").toString 
		)
	}
	
	@Test
	def void reactiveSystemWithFilterSimpleAnyOf() {
		val result = parseHelper.parse('''
			target A
			context Core, Input, Map
			comp Move in Input
			sys Foo
				trigger: added(Move)
				filter anyOf(Move)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		
		Assert.assertEquals('''
		public abstract class AbstractFooSystem : ReactiveSystem<InputEntity>{
		
			protected AbstractFooSystem(Contexts contexts) : base(contexts.input) {
			}
			protected override Collector<InputEntity> GetTrigger(IContext<InputEntity> context) {
				return context.CreateCollector(InputMatcher.Move, GroupEvent.Added);
			}
			readonly IMatcher<InputEntity> filterMatcher = InputMatcher.Move;
			protected override bool Filter(InputEntity entity) {
				return filterMatcher.Matches(entity);
			}
			protected abstract override void Execute(System.Collections.Generic.List<InputEntity> entities);
		}
		'''.toString, 
		result.systems.get(0).abstractSystemClass("Core").toString 
		)
	}
	
	@Test
	def void reactiveSystemWithFilterAllOfAnyOfNoneOfMix() {
		val result = parseHelper.parse('''
			target A
			context Core, Input, Map
			comp Move in Input
			comp A in Input
			comp B in Input
			comp C in Input
			sys Foo
				trigger : added(Move)
				filter allOf(Move) anyOf(A, B) noneOf(C)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		
		Assert.assertEquals('''
		public abstract class AbstractFooSystem : ReactiveSystem<InputEntity>{
		
			protected AbstractFooSystem(Contexts contexts) : base(contexts.input) {
			}
			protected override Collector<InputEntity> GetTrigger(IContext<InputEntity> context) {
				return context.CreateCollector(InputMatcher.Move, GroupEvent.Added);
			}
			readonly IMatcher<InputEntity> filterMatcher = Matcher<InputEntity>.AllOf(InputMatcher.Move)
				.AnyOf(InputMatcher.A, InputMatcher.B)
				.NoneOf(InputMatcher.C)
			;
			protected override bool Filter(InputEntity entity) {
				return filterMatcher.Matches(entity);
			}
			protected abstract override void Execute(System.Collections.Generic.List<InputEntity> entities);
		}
		'''.toString, 
		result.systems.get(0).abstractSystemClass("Core").toString 
		)
	}
	
	@Test
	def void multiReactiveSystem() {
		val result = parseHelper.parse('''
			target A
			context Core, Input, Map
			comp Move in Input
			comp A in Input
			comp B in Input
			sys Foo
				trigger: added(Move, A) removed(B)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		
		Assert.assertEquals('''
		public abstract class AbstractFooSystem : ReactiveSystem<InputEntity>{
		
			protected AbstractFooSystem(Contexts contexts) : base(contexts.input) {
			}
			protected override Collector<InputEntity> GetTrigger(IContext<InputEntity> context) {
				return new Collector<InputEntity>(
							new [] {
								context.GetGroup(Matcher<InputEntity>.AllOf(InputMatcher.Move, InputMatcher.A)), 
								context.GetGroup(InputMatcher.B)
							},
							new [] {
								GroupEvent.Added, 
								GroupEvent.Removed
							}
						);
			}
			protected abstract override void Execute(System.Collections.Generic.List<InputEntity> entities);
			protected abstract override bool Filter(InputEntity entity);
		}
		'''.toString, 
		result.systems.get(0).abstractSystemClass("Core").toString 
		)
	}
	
	@Test
	def void systemWithContextAccess() {
		val result = parseHelper.parse('''
			target A
			context Core, Input, Map
			comp Move in Input
			comp A in Input
			comp B in Input
			sys Foo
				access:
					mapCtx : Map
					inputCtx : Input
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		
		Assert.assertEquals('''
		public abstract class AbstractFooSystem : IExecuteSystem{
			protected readonly MapContext mapCtx;
			protected readonly InputContext inputCtx;
		
			protected AbstractFooSystem(Contexts contexts) {
				mapCtx = contexts.map;
				inputCtx = contexts.input;
			}
			public abstract void Execute();
		}
		'''.toString, 
		result.systems.get(0).abstractSystemClass("Core").toString 
		)
	}
	
	@Test
	def void systemWithContextAccessAndExplicitContextList() {
		val result = parseHelper.parse('''
			target A
			context Core, Input, Map
			comp Move in Input
			comp A in Input
			comp B in Input
			sys Foo (explicit_context_list)
				access:
					mapCtx : Map
					inputCtx : Input
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		
		Assert.assertEquals('''
		public abstract class AbstractFooSystem : IExecuteSystem{
			protected readonly MapContext mapCtx;
			protected readonly InputContext inputCtx;
		
			protected AbstractFooSystem(InputContext input, MapContext map) {
				this.mapCtx = map;
				this.inputCtx = input;
			}
			public abstract void Execute();
		}
		'''.toString, 
		result.systems.get(0).abstractSystemClass("Core").toString 
		)
	}
	
	@Test
	def void systemWithGroupContextAccessAndExplicitContextList() {
		val result = parseHelper.parse('''
			target A
			context Core, Input, Map
			comp Move in Input
			comp A in Input
			comp B in Input
			sys Foo (explicit_context_list)
				access:
					mapCtx : Map
					inputs : allOf(A, B)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		
		Assert.assertEquals('''
		public abstract class AbstractFooSystem : IExecuteSystem{
			protected readonly MapContext mapCtx;
			protected readonly IGroup<InputEntity> inputs;
		
			protected AbstractFooSystem(InputContext input, MapContext map) {
				this.mapCtx = map;
				this.inputs = input.GetGroup(Matcher<InputEntity>.AllOf(InputMatcher.A, InputMatcher.B)
				);
			}
			public abstract void Execute();
		}
		'''.toString, 
		result.systems.get(0).abstractSystemClass("Core").toString 
		)
	}
	
	@Test
	def void systemWithTriggerGroupContextAccessAndExplicitContextList() {
		val result = parseHelper.parse('''
			target A
			context Core, Input, Map
			comp Move in Input
			comp A in Input
			comp B in Input
			comp C in Core
			sys Foo (explicit_context_list)
				trigger: added(C)
				access:
					mapCtx : Map
					inputs : allOf(A, B)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		
		Assert.assertEquals('''
		public abstract class AbstractFooSystem : ReactiveSystem<CoreEntity>{
			protected readonly MapContext mapCtx;
			protected readonly IGroup<InputEntity> inputs;
		
			protected AbstractFooSystem(CoreContext core, InputContext input, MapContext map) : base(core) {
				this.mapCtx = map;
				this.inputs = input.GetGroup(Matcher<InputEntity>.AllOf(InputMatcher.A, InputMatcher.B)
				);
			}
			protected override Collector<CoreEntity> GetTrigger(IContext<CoreEntity> context) {
				return context.CreateCollector(CoreMatcher.C, GroupEvent.Added);
			}
			protected abstract override void Execute(System.Collections.Generic.List<CoreEntity> entities);
			protected abstract override bool Filter(CoreEntity entity);
		}
		'''.toString, 
		result.systems.get(0).abstractSystemClass("Core").toString 
		)
	}
	
	@Test
	def void systemWithGroupsAccess() {
		val result = parseHelper.parse('''
			target A
			context Core, Input, Map
			comp Move in Input
			comp Pos in Map
			comp A in Input
			comp B in Input
			sys Foo
				access:
					moveables : allOf(Move)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		
		Assert.assertEquals('''
		public abstract class AbstractFooSystem : IExecuteSystem{
			protected readonly IGroup<InputEntity> moveables;
		
			protected AbstractFooSystem(Contexts contexts) {
				moveables = contexts.input.GetGroup(InputMatcher.Move);
			}
			public abstract void Execute();
		}
		'''.toString, 
		result.systems.get(0).abstractSystemClass("Core").toString 
		)
	}
	
	@Test
	def void systemWithGroupsAccessMultiple() {
		val result = parseHelper.parse('''
			target A
			context Core, Input, Map
			comp Move in Input
			comp Pos in Map
			comp A in Input
			comp B in Input
			sys Foo
				access:
					moveables : allOf(Move) anyOf(A)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		
		Assert.assertEquals('''
		public abstract class AbstractFooSystem : IExecuteSystem{
			protected readonly IGroup<InputEntity> moveables;
		
			protected AbstractFooSystem(Contexts contexts) {
				moveables = contexts.input.GetGroup(Matcher<InputEntity>.AllOf(InputMatcher.Move)
					.AnyOf(InputMatcher.A)
				);
			}
			public abstract void Execute();
		}
		'''.toString, 
		result.systems.get(0).abstractSystemClass("Core").toString 
		)
	}
	
	@Test
	def void systemWithGroupsAccessMultiple2() {
		val result = parseHelper.parse('''
			target A
			context Core, Input, Map
			comp Move in Input
			comp Pos in Map
			comp A in Input
			comp B in Input
			sys Foo
				access:
					moveables : allOf(Move) noneOf(A)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		
		Assert.assertEquals('''
		public abstract class AbstractFooSystem : IExecuteSystem{
			protected readonly IGroup<InputEntity> moveables;
		
			protected AbstractFooSystem(Contexts contexts) {
				moveables = contexts.input.GetGroup(Matcher<InputEntity>.AllOf(InputMatcher.Move)
					.NoneOf(InputMatcher.A)
				);
			}
			public abstract void Execute();
		}
		'''.toString, 
		result.systems.get(0).abstractSystemClass("Core").toString 
		)
	}
	
	@Test
	def void systemWithGroupsAccessExplicitContext() {
		val result = parseHelper.parse('''
			target A
			context Core, Input, Map
			comp Move in Input
			comp Pos in Map
			comp A in Input
			comp B in Input
			sys Foo
				access:
					moveables : anyOf(Pos)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		
		Assert.assertEquals('''
		public abstract class AbstractFooSystem : IExecuteSystem{
			protected readonly IGroup<MapEntity> moveables;
		
			protected AbstractFooSystem(Contexts contexts) {
				moveables = contexts.map.GetGroup(MapMatcher.Pos);
			}
			public abstract void Execute();
		}
		'''.toString, 
		result.systems.get(0).abstractSystemClass("Core").toString 
		)
	}
	
	@Test
	def void systemWithGroupsAccessMultipleComponents() {
		val result = parseHelper.parse('''
			target A
			context Core, Input, Map
			comp Move in Input
			comp Pos in Map
			comp A in Input
			comp B in Input
			sys Foo
				access:
					moveables : anyOf(A, B) noneOf(Move, A)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		
		Assert.assertEquals('''
		public abstract class AbstractFooSystem : IExecuteSystem{
			protected readonly IGroup<InputEntity> moveables;
		
			protected AbstractFooSystem(Contexts contexts) {
				moveables = contexts.input.GetGroup(Matcher<InputEntity>.AnyOf(InputMatcher.A, InputMatcher.B)
						.NoneOf(InputMatcher.Move, InputMatcher.A)
				);
			}
			public abstract void Execute();
		}
		'''.toString, 
		result.systems.get(0).abstractSystemClass("Core").toString 
		)
	}
}
