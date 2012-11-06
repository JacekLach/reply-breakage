(defproject reply-breakage "1.0.0-SNAPSHOT"
  :description "REPL-y does not work with commons.exec"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.apache.commons/commons-exec "1.0.1"]
                 [reply/reply "0.1.1"]]
  :main        reply-breakage.core )
