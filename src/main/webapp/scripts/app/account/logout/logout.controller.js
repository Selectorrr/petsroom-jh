'use strict';

angular.module('petsroomApp')
    .controller('LogoutController', function (Auth) {
        Auth.logout();
    });
