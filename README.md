# logging issue when targetting Node.js

For any optimization other than `none`, there appears no logging.

Steps to reproduce:

```bash
$ clj -m cljs.main -v -O simple -t node -c huon.core
$ node out/main.js
via println
```

When setting optimization to none:
```bash
$ clj -m cljs.main -v -O none -t node -c huon.core
$ node out/main.js
 [  0.003s] [huon.core:6] [ERROR] error!
via println
```

When not targetting Node.js there appears to be no problem:
```bash
$ clj -m cljs.main -v -O simple -c huon.core
$ open index.html
```


# possible fix

See [log.cljs](./src/huon/log.cljs#L19)