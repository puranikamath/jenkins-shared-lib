#!/usr/bin/env groovy
package com.simplebuilder

class GlobalVars {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import com.simplebuilder.GlobalVars
   // println GlobalVars.foo
}
