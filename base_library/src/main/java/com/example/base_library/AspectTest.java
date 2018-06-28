package com.example.base_library;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectTest {
    @Around("execution(* android.view.View.OnClickListener.onClick(..))")
    public void onClickMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        joinPoint.proceed();
        Log.i("helloAOP", "aspect:::" + joinPoint.getSignature());
    }
}
