(defproject assistant "0.1.0-SNAPSHOT"
  :description "A super awesome extensible personal assistant"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.145"]
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
                 [cljs-http "0.1.15"]
                 [com.cognitect/transit-cljs "0.8.188"]
                 [markdown-clj "0.9.54"]
                 [domina "1.0.2"]
                 [garden "1.2.1"]
                 [prismatic/dommy "0.1.3"]
                 [hickory "0.5.4"]
                 [org.omcljs/om "1.0.0-alpha14"]
                 [figwheel-sidecar "0.4.0" :scope "provided"]]

  :plugins [[lein-cljsbuild "1.0.6-SNAPSHOT"]
            [lein-node-webkit-build "0.1.6"]]

  :source-paths ["src"]

  :node-webkit-build {:root "./public"
                      :name "Assistant"
                      :nw-version "0.11.6"
                      :osx {:icon "./public/images/icon.icns"}
                      :platforms #{:osx}
                      :disable-developer-toolbar true}

  :cljsbuild {
    :builds [{:id "assistant"
              :source-paths ["src" "plugins"]
              :compiler {
                :output-to "public/assistant.js"
                :output-dir "public/out"
                :optimizations :none
                :source-map true}}]})
