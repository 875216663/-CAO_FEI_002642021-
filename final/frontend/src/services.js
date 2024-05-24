export function fetchLogin(username) {
	return fetch("/api/session", {
		method: "POST",
		headers: new Headers({
			"content-type": "application/json",
		}),
		body: JSON.stringify({ username }),
	})
		.catch(() => Promise.reject({ error: "networkError" }))
		.then((response) => {
			if (response.ok) {
				return response.json();
			}
			return response
				.json()
				.catch((error) => Promise.reject({ error }))
				.then((err) => Promise.reject(err));
		});
}

export function fetchLogout() {
	return fetch("/api/session", {
		method: "DELETE",
	})
		.catch(() => Promise.reject({ error: "networkError" }))
		.then((response) => {
			if (response.ok) {
				return response.json();
			}
			return response
				.json()
				.catch((error) => {
					Promise.reject({ error });
				})
				.then((err) => Promise.reject(err));
		});
}

export function fetchSession() {
	return fetch("/api/session", {
		method: "GET",
	})
		.catch(() => Promise.reject({ error: "networkError" }))
		.then((response) => {
			if (response.ok) {
				return response.json();
			}
			return response
				.json()
				.catch((error) => Promise.reject({ error }))
				.then((err) => Promise.reject(err));
		});
}
export function fetchtodos() {
	return fetch("/api/todos", {
		method: "GET",
	})
		.catch(() => Promise.reject({ error: "networkError" }))
		.then((response) => {
			if (response.ok) {
				return response.json();
			}
			return response
				.json()
				.catch((error) => Promise.reject({ error }))
				.then((err) => Promise.reject(err));
		});
}

export function fetchAddTask(task) {
	return fetch("/api/todos", {
		method: "POST",
		headers: new Headers({
			"content-type": "application/json",
		}),
		body: JSON.stringify({ 
			task:{
				name: task.name,
				startTime: task.startTime,
				endTime: task.endTime,
			}
		 }),
	})
		.catch(() => Promise.reject({ error: "networkError" }))
		.then((response) => {
			if (response.ok) {
				return response.json();
			}
			return response
				.json()
				.catch((error) => Promise.reject({ error }))
				.then((err) => Promise.reject(err));
		});
}
export function fetchUpdateStatues(id) {
	return fetch(`/api/todos/${id}/status`, {
		method: "PUT",
		headers: new Headers({
			"content-type": "application/json",
		}),
	})
		.catch(() => Promise.reject({ error: "networkError" }))
		.then((response) => {
			if (response.ok) {
				return response.json();
			}
			return response
				.json()
				.catch((error) => Promise.reject({ error }))
				.then((err) => Promise.reject(err));
		});
}

export function fetchDeleteTask(id) {
	return fetch(`/api/todos/${id}`, {
		method: "DELETE",
	})
		.catch(() => Promise.reject({ error: "networkError" }))
		.then((response) => {
			if (response.ok) {
				return response.json();
			}
			return response
				.json()
				.catch((error) => Promise.reject({ error }))
				.then((err) => Promise.reject(err));
		});
}


export function fetchUpdateTask(id, task) {
	return fetch(`/api/todos/${id}`, {
		method: "PUT",
		headers: new Headers({
			"content-type": "application/json",
		}),
		body: JSON.stringify({ task }),
	})
		.catch(() => Promise.reject({ error: "networkError" }))
		.then((response) => {
			if (response.ok) {
				return response.json();
			}
			return response
				.json()
				.catch((error) => Promise.reject({ error }))
				.then((err) => Promise.reject(err));
		});
}