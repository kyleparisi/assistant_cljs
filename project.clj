(defproject assistant "0.1.0-SNAPSHOT"
  :description "A super awesome extensible personal assistant"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.145"]
                 [hickory "0.5.4"]
                 [cljs-http "0.1.15"]
                 [org.omcljs/om "1.0.0-alpha14"]
                 [com.cognitect/transit-cljs "0.8.188"]
                 [garden "1.2.1"]
                 [markdown-clj "0.9.54"]
                 [figwheel-sidecar "0.4.0" :scope "provided"]]

  :plugins [[lein-cljsbuild "1.0.6-SNAPSHOT"]]

  :source-paths ["src"]

  :cljsbuild {
      :builds [{:id "assistant"
                :source-paths ["src/assistant" "plugins"]
                :compiler {
                  :output-to "resources/public/assistant.js"
                  :output-dir "resources/public/out"
                  :optimizations :none
                  :source-map true}}
                {:id "electron-dev",
                 :source-paths ["src/electron"], 
                 :compiler {
                  :output-to "./main.js",
                  :optimizations :simple
                  :pretty-print true
                  :cache-analysis true}}]})


                