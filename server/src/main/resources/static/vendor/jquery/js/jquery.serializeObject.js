//
// Use internal $.serializeArray to get list of form elements which is
// consistent with $.serialize
//
// From version 2.0.0, $.serializeObject will stop converting [name] values
// to camelCase format. This is *consistent* with other serialize methods:
//
//   - $.serialize
//   - $.serializeArray
//
// If you require camel casing, you can either download version 1.0.4 or map
// them yourself.
//

(function($){
    $.fn.serializeObject = function () {
        "use strict";

        var result = {};
        var extend = function (i, element) {
        var node = result[element.name];

        // If node with same name exists already, need to convert it to an array as it
        // is a multi-value field (i.e., checkboxes)

            if ('undefined' !== typeof node && node !== null) {
                if ($.isArray(node)) {
                    node.push(element.value);
                } else {
                    result[element.name] = [node, element.value];
                }
            } else {
                result[element.name] = element.value;
            }
        };

        $.each(this.serializeArray(), extend);
        return result;
    };
    
    $.fn.serializeCamelObject = function () {
        "use strict";
        var result = {};
        var extend = function (i, element) {
        var node = result[element.name];
    
        // If node with same name exists already, need to convert it to an array as it
        // is a multi-value field (i.e., checkboxes)
    
            if ('undefined' !== typeof node && node !== null) {
                if ($.isArray(node)) {
                    node.push(element.value);
                } else {
                    result[$(this).toCamelCase(element.name)] = [node, element.value];
                }
            } else {
                result[$(this).toCamelCase(element.name)] = element.value;
            }
        };
    
        $.each(this.serializeArray(), extend);
        return result;
    };
    
    $.fn.toCamelCase = function (str) {
        var reName = str;
        if (str.match("_")) {
            reName =  str.toLowerCase().replace(/[^a-zA-Z0-9]+(.)/g, (m, chr) => chr.toUpperCase());
        }
         return reName;
    };
    
    Date.prototype.yyyymmdd = function() {
      var mm = this.getMonth() + 1;
      var dd = this.getDate();
    
      return [this.getFullYear(),
              (mm>9 ? '' : '0') + mm,
              (dd>9 ? '' : '0') + dd
             ].join('');
    };

    Date.prototype.hhmmss = function() {
      var hh = this.getHours();
      var mm = this.getMinutes();
      var ss = this.getSeconds();
    
      return [(hh>9 ? '' : '0') + hh,
              (mm>9 ? '' : '0') + mm,
              (ss>9 ? '' : '0') + ss,
             ].join('');
    };
    
    Date.prototype.yyyymmddhhmmss = function() {
      return this.yyyymmdd() + this.hhmmss();
    };
        
})(jQuery);