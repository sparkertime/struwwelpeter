(defproject struwwelpeter "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.3"]
                 [ring/ring-core "1.1.5"]
                 [ring/ring-jetty-adapter "1.1.5"]
                 [ring-middleware-force-reload "0.1.0-SNAPSHOT"]
                 [enlive "1.0.1" :exclusions [org.clojure/clojure]]]
  :main struwwelpeter.core)
