package com.amey.androidboilerplate.test.common.injection.component;

import javax.inject.Singleton;

import dagger.Component;
import com.amey.androidboilerplate.injection.component.ApplicationComponent;
import com.amey.androidboilerplate.test.common.injection.module.ApplicationTestModule;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends ApplicationComponent {

}
