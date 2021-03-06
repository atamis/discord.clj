(ns discord.core
  (:require [discord.bot :as bot]
            [discord.config :as config])
  (:gen-class))

(defn -main
  "Creates a new discord bot and supplies a series of extensions to it."
  [& args]
  (let [bot-name            (config/get-bot-name)
        prefix              (config/get-prefix)
        extension-folders   (config/get-extension-folders)]
    (bot/from-files bot-name prefix extension-folders)))
