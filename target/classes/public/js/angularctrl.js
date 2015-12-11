var TodoListController = function($scope, $http) {

  $scope.editMode = false;
  $scope.position = '';

  $scope.viewAllTodolist = function(){
	$http.get('todo/all.json').success(function(response){
		$scope.todo = response;
	})  
  };
  
  $scope.resetTodolistField = function() {
    $scope.ab.todoitem = '';
    $scope.ab.tododescription = '';
    $scope.ab.isComplete = '';
    $scope.editMode = false;
  };

  $scope.addTodolist = function(ab) {
    $http.post('todo/add', ab).success(function(response) {
      $scope.viewAllTodolist();
      $scope.ab.todoitem = '';
      $scope.ab.tododescription = '';
      $scope.ab.isComplete = '';
    }).error(function(response) {
      console.log(response);
    });
  };

  $scope.updateTodolist = function(ab) {
    $http.put('todo/update'+$scope.position, ab).success(function(response) {
      $scope.viewAllTodolist();
      $scope.ab.todoitem = '';
      $scope.ab.tododescription = '';
      $scope.ab.isComplete = '';
    }).error(function(response) {
      console.log(response);
    });
  };

  $scope.deleteTodolist = function(id) {
    $http.delete('todo/delete' + id).success(function(response) {
      $scope.viewAllTodolist();
    }).error(function(response) {
      console.log(response);
    });
  };

  $scope.editTodolist = function(pos, todothing) {
    $scope.position = pos;
    $scope.ab = todothing;
    $scope.editMode = true;
  };

  $scope.viewAllTodolist();

};
