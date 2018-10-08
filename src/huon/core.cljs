(ns huon.core
  (:require [huon.log :as log :refer [debug info warn error]]))

(defn ^:export main [& args]
  (log/enable!)
  (log/set-root-level! :debug)
  (error "error!")
  (println "via println"))

(set! *main-cli-fn* main)
