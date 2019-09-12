(ns search.core
  (:gen-class))

(def one "/home/kevinmungai/clojure/search/files/one.txt")
(def two "/home/kevinmungai/clojure/search/files/two.txt")
(def three "/home/kevinmungai/clojure/search/files/three.txt")
(def four "/home/kevinmungai/clojure/search/files/four.txt")
(def five "/home/kevinmungai/clojure/search/files/five.txt")


(defn contains-a?
  [document]
  (with-open [rdr (clojure.java.io/reader document)]
    (clojure.string/includes? (line-seq rdr) "a")))
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
