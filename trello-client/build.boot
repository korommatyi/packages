(set-env!
 :resource-paths #{"resources"}
 :dependencies '[[cljsjs/boot-cljsjs "0.9.0"  :scope "test"]])

(require '[cljsjs.boot-cljsjs.packaging :refer :all])

(def +lib-version+ "0.0.1")
(def +version+ (str +lib-version+ "-1"))

(task-options!
  pom {:project     'cljsjs/trello-client
       :version     +version+
       :description "Trello client js"
       :url         "https://developers.trello.com/clientjs"
       :license     {"BSD" "http://opensource.org/licenses/BSD-3-Clause"}})

(deftask package []
  (comp
    (pom)
    (jar)))
