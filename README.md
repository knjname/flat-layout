# flat-layout

A Leiningen template for creating flat layout project.

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

You can run the created project.

```
$> cd <project-name>
$> lein run
```

That's all.

This is convenience if you want to write up some small code.

After writing up your code, you can ```git push``` to Gist. (Gist doesn't allow us to upload a project including sub directories.)
