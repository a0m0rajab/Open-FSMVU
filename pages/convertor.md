---
title: convertor page
permalink: /convertor/
---

{% capture includeGuts %}
{% include convertor.html %} 
{% endcapture %}
{{ includeGuts | replace: '    ', ''}}

{% include convertor.html %} 
