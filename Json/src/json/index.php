<!DOCTYPE html>
<html>
    <head>
        <meta charset="windows-1252">
        <title>JSON Example: Yelp</title>
        <script src="/yelpJson.json"></script>
        <script>
            var result = '{
    "businesses": [
        {
            "categories": [
                [
                    "Local Flavor",
                    "localflavor"
                ],
                [
                    "Mass Media",
                    "massmedia"
                ]
            ],
            "display_phone": "+1-415-908-3801",
            "id": "yelp-san-francisco",
            "image_url": "http://s3-media3.fl.yelpcdn.com/bphoto/nQK-6_vZMt5n88zsAS94ew/ms.jpg",
            "is_claimed": true,
            "is_closed": false,
            "location": {
                "address": [
                    "140 New Montgomery St"
                ],
                "city": "San Francisco",
                "coordinate": {
                    "latitude": 37.7867703362929,
                    "longitude": -122.399958372115
                },
                "country_code": "US",
                "cross_streets": "Natoma St & Minna St",
                "display_address": [
                    "140 New Montgomery St",
                    "Financial District",
                    "San Francisco, CA 94105"
                ],
                "geo_accuracy": 9.5,
                "neighborhoods": [
                    "Financial District",
                    "SoMa"
                ],
                "postal_code": "94105",
                "state_code": "CA"
            },
            "mobile_url": "http://m.yelp.com/biz/yelp-san-francisco",
            "name": "Yelp",
            "phone": "4159083801",
            "rating": 2.5,
            "rating_img_url": "http://s3-media4.fl.yelpcdn.com/assets/2/www/img/c7fb9aff59f9/ico/stars/v1/stars_2_half.png",
            "rating_img_url_large": "http://s3-media2.fl.yelpcdn.com/assets/2/www/img/d63e3add9901/ico/stars/v1/stars_large_2_half.png",
            "rating_img_url_small": "http://s3-media4.fl.yelpcdn.com/assets/2/www/img/8e8633e5f8f0/ico/stars/v1/stars_small_2_half.png",
            "review_count": 7140,
            "snippet_image_url": "http://s3-media4.fl.yelpcdn.com/photo/YcjPScwVxF05kj6zt10Fxw/ms.jpg",
            "snippet_text": "What would I do without Yelp?\n\nI wouldn't be HALF the foodie I've become it weren't for this business.    \n\nYelp makes it virtually effortless to discover new...",
            "url": "http://www.yelp.com/biz/yelp-san-francisco"
        }
    ],
    "total": 2316
}
'
            function runYelp(result) {
                var numberOfResults = 1;
                var yelpObj;
                yelpObj = JSON.parse(result);
                var output = "";
                for (var i = 0; i < numberOfResults; i++) {
                    output += ""
                            + "<img src=\"" + yelpObj.businesses[i].image_url + "\">"
                            + "</br>"
                            + yelpObj.businesses[i].name
                            + "</br>"
                            + "<img src=\"" + yelpObj.businesses[i].rating_img_url_large + "\">"
                            + "</br>"
                            + yelpObj.businesses[i].review_count + " reviews"
                            + "</br>"
                            + yelpObj.businesses[i].display_phone
                            + "</br>"
                            + yelpObj.businesses[i].location.display_address[0]
                            + "</br>"
                            + yelpObj.businesses[i].location.display_address[1]
                            + "</br>"
                            + "</br>";
                    document.getElementById("output1").innerHTML = output;
                }
                ;
            }
        </script>
        <script>runYelp()</script>
    </head>
    <body>
        <div id="output1"></div>
    </body>
</html>
