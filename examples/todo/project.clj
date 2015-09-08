(defproject io.sarnowski/swagger1st-todo "0.1.0-SNAPSHOT"
  :description "An example application for swagger1st integrating with the component framework."

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [ring "1.4.0"]
                 [io.sarnowski/swagger1st "0.15.0"]
                 [com.stuartsierra/component "0.2.3"]
                 [org.slf4j/slf4j-simple "1.7.12"]]

  :main ^:skip-aot todo.core

  :profiles {:uberjar {:aot :all}

             :dev {:repl-options {:init-ns user}
                   :source-paths ["dev"]
                   :dependencies [[org.clojure/tools.namespace "0.2.10"]
                                  [org.clojure/java.classpath "0.2.2"]]}})
