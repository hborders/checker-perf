This demonstrates performance problems with Checker for certain programming patterns.

Performs fine for:
```
./gradlew :either2:assemble -DrocksSkipCheckerFramework=false
./gradlew :emptyeither2:assemble -DrocksSkipCheckerFramework=false
./gradlew :either3:assemble -DrocksSkipCheckerFramework=false
./gradlew :emptyeither3:assemble -DrocksSkipCheckerFramework=false
```

Performance degrades significantly for:
```
./gradlew :either4:assemble -DrocksSkipCheckerFramework=false
./gradlew :emptyeither4:assemble -DrocksSkipCheckerFramework=false
```
and higher

Filed an issue with checker: https://github.com/typetools/checker-framework/issues/4412
