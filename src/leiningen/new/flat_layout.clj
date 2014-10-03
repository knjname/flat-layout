(ns leiningen.new.flat-layout
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "flat-layout"))

(defn flat-layout
  "Generates flat-layout leiningen project."
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' flat-layout project.")
    (->files data
             ["{{sanitized}}.clj" (render "foo.clj" data)]
             ["project.clj" (render "project.clj" data)])))
