(ns demo.views.home
  (:require [demo.routes :as routes]
            [demo.subs :as subs]
            [re-frame.core :as re-frame]))

(defn render []
  [:div
    [:p
      [:span "This page is bundled in the base module, but the "]
      [:a.text-blue.no-underline.hover:underline {:href (routes/visualization)} "visualization page"]]
    [:p " loads the chart module with a d3 js dependency."]])
