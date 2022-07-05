
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]


<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/gacerioni/harness_utils_cg_universal_api_caller">
    <img src="images/harness_banner.jpeg" alt="Logo">
  </a>

  <h3 align="center">Harness CI/CD Next-Gen Java SpringBoot JPA DEMO - by Gabs the Creator</h3>

<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation-and-usage">Installation and Usage</a></li>
      </ul>
    </li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#tech-stack">Tech Stack</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

The main goal of this project is to mantain a trustful and GitOps-compatible approach to a full CI/CD Pipeline.  
Using Harness CIE and CD (both Next-Gen).

**I'll try my best to keep this project relevant, and indepentent.  
Always ready for Production Deployment (Continuous Delivery).**

### How? By making sure that all the files required to do the FULL Software LifeCycle is here.

For example, that's what I have in mind for now:

* Java source code, being the real src content;
* Configuration files, where all sensitive and dynamic data are environment variables (application.properties, etc);
* Configuration as Code;
* Dockerfile;
* Kubernetes Templates;
* Helm Chart files, and all overrides that are required to build a Helm Chart as a final artifact;
* Infrastructure as Code, in case we need like an environment at runtime. Maybe for testing and then destroying it;
* All Harness content as code, also known as CaC (Config-as-Code);
* etc.


<!-- GETTING STARTED -->
## Getting Started

### Prerequisites

* [Java 17 (SDK)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

* A Harness Next-Gen account, of course!

### Installation and Usage

1. Clone the repo
   ```sh
   git clone https://github.com/gacerioni/springboot-postgres-demo-gabs.git
   cd springboot-postgres-demo-gabs
   ```
   
# TODO - NOTHING IS VALID BEYOND THIS POINT!
   
2. Install the project dependecies (very simple stuff, meant to deal with requests, json, html)
   ```sh
   pip install -r requirements.txt
   <OR>
   python3 -m pip install -r requirements.txt
   ```
3. Export the required variables (Just to avoid Secrets, KMS, Vaults, etc, to keep this project simple)
   ```sh
   cd ./harness_utils_cg_universal_api_caller
   python(3) main.py -h
   ```

<!-- ROADMAP -->
## Roadmap

See the [open issues](https://github.com/gacerioni/harness_utils_cg_universal_api_caller/issues) for a list of proposed features (and known issues).



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.



<!-- CONTACT -->
## Contact

Gabriel Cerioni - [@gabs.tar.gz](https://www.instagram.com/gabs.tar.gz/) - gacerioni@gmail.com

Project Link: [https://github.com/gacerioni/harness_utils_cg_universal_api_caller/](https://github.com/gacerioni/harness_utils_cg_universal_api_caller/)

<!-- Tech Stack -->
## Tech Stack

* [Python](https://www.python.org/)
* [Harness](https://harness.io)



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/gacerioni/harness_utils_cg_universal_api_caller.svg?style=for-the-badge
[contributors-url]: https://github.com/gacerioni/harness_utils_cg_universal_api_caller/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/gacerioni/harness_utils_cg_universal_api_caller.svg?style=for-the-badge
[forks-url]: https://github.com/gacerioni/harness_utils_cg_universal_api_caller/network/members
[stars-shield]: https://img.shields.io/github/stars/gacerioni/harness_utils_cg_universal_api_caller.svg?style=for-the-badge
[stars-url]: https://github.com/gacerioni/harness_utils_cg_universal_api_caller/stargazers
[issues-shield]: https://img.shields.io/github/issues/gacerioni/harness_utils_cg_universal_api_caller.svg?style=for-the-badge
[issues-url]: https://github.com/gacerioni/harness_utils_cg_universal_api_caller/issues
[license-shield]: https://img.shields.io/github/license/gacerioni/harness_utils_cg_universal_api_caller.svg?style=for-the-badge
[license-url]: https://github.com/gacerioni/harness_utils_cg_universal_api_caller/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/gacerioni
