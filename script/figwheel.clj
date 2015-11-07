(require '[figwheel-sidecar.repl :as r]
         '[figwheel-sidecar.repl-api :as ra])

(ra/start-figwheel!
  {:figwheel-options {}
   :build-ids ["dev"]
   :all-builds
   [{:id "dev"
     :figwheel true
     :source-paths ["src/assistant" "plugins"]
     :compiler {
      :output-to "resources/public/assistant.js"
      :output-dir "resources/public/out"
      :optimizations :none
      :source-map true}}]})
    
(ra/cljs-repl)
