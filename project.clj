(defproject ragtime "0.8.0"
  :description "A database-independent migration library"
  :url "https://github.com/weavejester/ragtime"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[ragtime/core "0.8.0"]
                 [ragtime/jdbc "0.8.0"]]
  :plugins [[lein-sub "0.3.0"]
            [lein-codox "0.10.3"]]
  :sub ["core" "jdbc"]
  :codox {:source-paths ["core/src" "jdbc/src"]
          :output-path  "codox"})
