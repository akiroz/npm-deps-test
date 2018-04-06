Compile cljs:
```
$ lein clean
$ lein cljsbuild once
```

Dump npm deps:
```
lein run > npm-deps.edn
```

With clojure tools:

```
clojure -m cljs.main -co cljsc_opts.edn -t browser -v -c npm-deps-test.core
```
