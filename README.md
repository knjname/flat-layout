# flat-layout

A Leiningen template for creating flat layout project.

[![Clojars Project](http://clojars.org/flat-layout/lein-template/latest-version.svg)](http://clojars.org/flat-layout/lein-template)

## Usage

To generate a flat layout leiningen project, just type this.

```
$> lein new flat-layout <project-name>
```

You'll get a project having following layout.

```
<project-name>/
  project.clj
  <project-name>.clj
```

(If you need another Clojure version, append `--template-version x.x.x` argument.)

You can run the created project.

```
$> cd <project-name>
$> lein run
```

That's all.

This is convenience if you want to write some small Gist snippet having external dependencies which should have been written in its project.clj. After writing your snippet, you can ```git push``` to Gist directly.

(Gist doesn't allow us to upload a project including sub directories.)

